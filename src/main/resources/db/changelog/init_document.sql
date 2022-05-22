create table if not exists documents (
	id  serial not null,
	pussport_information varchar(255),
	drive_information varchar(255),
	foreign key (id) references leaser(id)
);
