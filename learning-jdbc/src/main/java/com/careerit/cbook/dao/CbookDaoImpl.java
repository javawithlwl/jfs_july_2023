package com.careerit.cbook.dao;

import com.careerit.cbook.domain.Contact;
import com.careerit.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CbookDaoImpl implements CbookDao {

    private static final String ALL_APP_USERS = "select id,name,email,mobile from contact";
    private static final String SEARCH_CONTACT = "select id,name,email,mobile from contact where name ilike CONCAT('%',?,'%')";
    private static final String ADD_CONTACT = "insert into contact(name,email,mobile) values(?,?,?)";
    private static final String UPDATE_CONTACT = "update contact set name=?,email=?,mobile=? where id=?";
    private static final String DELETE_CONTACT = "delete from contact where id=?";
    private static final String GET_CONTACT_BY_ID = "select id,name,email,mobile from contact where id=?";

    @Override
    public Contact addContact(Contact contact) {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = ConnectionUtil.getConnection();
            pst = con.prepareStatement(ADD_CONTACT, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, contact.getName());
            pst.setString(2, contact.getEmail());
            pst.setString(3, contact.getMobile());
            int count = pst.executeUpdate();
            if (count == 1) {
                ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    contact.setId(rs.getLong(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(pst, con);
        }
        return contact;
    }

    @Override
    public List<Contact> getContacts() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<Contact> contacts = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(ALL_APP_USERS);
            while (rs.next()) {
                contacts.add(convertRowContactObject(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(rs, st, con);
        }
        return contacts;
    }

    private static Contact convertRowContactObject(ResultSet rs) throws SQLException {
        return Contact.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .mobile(rs.getString("email"))
                .email(rs.getString("mobile"))
                .build();
    }

    @Override
    public Contact updateContact(Contact contact) {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = ConnectionUtil.getConnection();
            pst = con.prepareStatement(UPDATE_CONTACT);
            pst.setString(1, contact.getName());
            pst.setString(2, contact.getEmail());
            pst.setString(3, contact.getMobile());
            pst.setLong(4, contact.getId());
            int count = pst.executeUpdate();
            if (count == 1) {
                contact = getContact(contact.getId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(pst, con);
        }
        return contact;

    }

    @Override
    public boolean deleteContact(String id) {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = ConnectionUtil.getConnection();
            pst = con.prepareStatement(DELETE_CONTACT);
            pst.setString(1, id);
            int count = pst.executeUpdate();
            if (count == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(pst, con);
        }
        return false;
    }

    @Override
    public Contact getContact(long id) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = ConnectionUtil.getConnection();
            pst = con.prepareStatement(GET_CONTACT_BY_ID);
            pst.setLong(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                return convertRowContactObject(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(rs, pst, con);
        }
        throw new IllegalArgumentException("Contact with id :" + id + " not found");
    }

    @Override
    public List<Contact> search(String str) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Contact> contacts = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            pst = con.prepareStatement(SEARCH_CONTACT);
            pst.setString(1, str);
            rs = pst.executeQuery();
            while (rs.next()) {
                contacts.add(convertRowContactObject(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(rs, pst, con);
        }
        return contacts;
    }

    @Override
    public long addContacts(List<Contact> contacts) {
        return 0;
    }
}
