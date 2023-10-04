create table todo_item(
        id bigserial primary key,
        title varchar(255) not null,
        description varchar(255),
        status varchar(255) not null default 'IN_PROGRESS'
)