drop table photo;
drop table image;
drop table category;

create table photo (
	id varchar(15) primary key,
	photoname varchar(100),
	description varchar(180),
        price decimal(3,2),
        imgid varchar(5),
        categoryid varchar(5)
);

create table image (
	id varchar(5) primary key,
	imgfile varchar(50)
);

create table category (
	id varchar(5) primary key,
	categoryname varchar(50)
);

/***PHOTOS***/
--auto shows
insert into photo (id, photoname, description, price, imgid, categoryid)
    values ('1', 'Fiat Abarth Emblem', 'The Abarth emblem on a Fiat 124 Spyder Abarth at the 2017 Chicago Auto Show', 2.00, '1', '1');
insert into photo (id, photoname, description, price, imgid, categoryid)
    values ('5', 'Green Lamborghini Aventador', 'Green Lamborghini Aventador at the 2017 Chicago Auto Show', 3.25, '5', '1');
--cars
insert into photo (id, photoname, description, price, imgid, categoryid)
    values ('25', 'Aston Martin Wheel', 'Close-up of an Aston Martin wheel', 3.50, '25', '2');
insert into photo (id, photoname, description, price, imgid, categoryid)
    values ('26', 'Ferrari 458', 'A red Ferrari 458 drives through Greenfield', 3.50, '26', '2');
--outdoors
insert into photo (id, photoname, description, price, imgid, categoryid)
    values ('33', 'Colorful Fungus', 'A log growing some vibrant fungus in a Black River Falls forest', 2.50, '33', '3');
insert into photo (id, photoname, description, price, imgid, categoryid)
    values ('34', 'Fall Railroad', 'Looking down the Milwaukee County Zoo railroad tracks in the middle of fall', 2.00, '34', '3');

/***IMAGES***/
insert into image (id, imgfile) values ('1', 'autoshows/abarth-emblem.jpg');
insert into image (id, imgfile) values ('5', 'autoshows/green-aventador.jpg');
insert into image (id, imgfile) values ('25', 'cars/aston-martin-wheel.jpg');
insert into image (id, imgfile) values ('26', 'cars/ferrari-458.jpg');
insert into image (id, imgfile) values ('33', 'outdoors/colorful-fungus.jpg');
insert into image (id, imgfile) values ('34', 'outdoors/fall-railroad.jpg');

/***CATEGORIES***/
insert into category (id, categoryname) values ('1', 'Auto Shows');
insert into category (id, categoryname) values ('2', 'Cars');
insert into category (id, categoryname) values ('3', 'Outdoors');