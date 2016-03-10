CREATE TABLE employee
(
	id int not null  AUTO_INCREMENT,
	firstName varchar(255),
	lastName varchar(255),
	title varchar(255),
	city varchar(255),
    officePhone varchar(255),
    cellPhone varchar(255),
    email varchar(255),
	picture varchar(255),
	department varchar(255),
	managerId int,
	PRIMARY KEY (id)
);


INSERT INTO employee 
	( firstName, lastName,  title,  city,  department, managerId, officePhone,  cellPhone,  email,  picture)  
VALUES  
	('Barack',  'Obama',  'President',  'Washington, DC',  'White House',  1,  '202-000-0000',  '202-000-1111',  'bo@mail.com', 'bo.jpg');


	