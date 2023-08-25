package com.careerit.jsf.day27;

interface JpaRepository<T,ID>{

}

interface MyJpaRepository<T extends BaseEntity ,ID> extends JpaRepository<T,ID>{

}

interface GenericRepo extends MyJpaRepository<Employee,String> {

}

class BaseEntity{

}
class Contact extends  BaseEntity{

}
class Employee extends  BaseEntity{

}

public class BoundedParameterExample {
}
