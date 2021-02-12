CREATE TABLE public.personal_information (
	id serial NOT NULL,
	address varchar(255) NULL,
	age int4 NOT NULL,
	birthdate varchar(255) NULL,
	"degree" varchar(255) NULL,
	email varchar(255) NULL,
	last_name varchar(255) NULL,
	"name" varchar(255) NULL,
	nationality varchar(255) NULL,
	phone_number varchar(255) NULL,
	summary varchar(255) NULL,
	web varchar(255) NULL,
	CONSTRAINT personal_information_pkey PRIMARY KEY (id)
);

CREATE TABLE public.certificates (
	id serial NOT NULL,
	company varchar(255) NULL,
	end_year varchar(255) NULL,
	expires bool NULL DEFAULT true,
	link varchar(255) NULL,
	"name" varchar(255) NULL,
	start_year varchar(255) NULL,
	CONSTRAINT certificates_pkey PRIMARY KEY (id)
);

CREATE TABLE public.curriculum_vitae (
	id serial NOT NULL,
	id_personal_information int4 NULL,
	CONSTRAINT curriculum_vitae_pkey PRIMARY KEY (id),
	CONSTRAINT fke7ok1sw6ocivg4ubfpty56fqm FOREIGN KEY (id_personal_information) REFERENCES personal_information(id)
);

CREATE TABLE public.skills (
	id serial NOT NULL,
	"name" varchar(255) NULL,
	link varchar(255) NULL,
	CONSTRAINT skills_pkey PRIMARY KEY (id)
);

CREATE TABLE public.training (
	id serial NOT NULL,
	academic_discipline varchar(255) NULL,
	"degree" varchar(255) NULL,
	end_year varchar(255) NULL,
	link varchar(255) NULL,
	start_year varchar(255) NULL,
	summary varchar(255) NULL,
	university varchar(255) NULL,
	CONSTRAINT training_pkey PRIMARY KEY (id)
);

CREATE TABLE public.work_experience (
	id serial NOT NULL,
	active bool NULL DEFAULT false,
	company varchar(255) NULL,
	end_year varchar(255) NULL,
	link varchar(255) NULL,
	"location" varchar(255) NULL,
	"position" varchar(255) NULL,
	start_year varchar(255) NULL,
	workday varchar(255) NULL,
	CONSTRAINT work_experience_pkey PRIMARY KEY (id)
);

CREATE TABLE public.curriculum_vitae_certificates (
	id_curriculum_vitae int4 NOT NULL,
	id_certificates int4 NOT NULL,
	CONSTRAINT uk_aqfimpubgpcesusk6wfhaqc7e UNIQUE (id_certificates),
	CONSTRAINT fk1o2eaxj7c06bs8oa1ek2pb43p FOREIGN KEY (id_curriculum_vitae) REFERENCES curriculum_vitae(id),
	CONSTRAINT fkd5octfu1x2nl14dx8e796muyc FOREIGN KEY (id_certificates) REFERENCES certificates(id)
);

CREATE TABLE public.curriculum_vitae_skills (
	id_curriculum_vitae int4 NOT NULL,
	id_skills int4 NOT NULL,
	CONSTRAINT uk_tr4o1ng1y41hrykin4pvs17lt UNIQUE (id_skills),
	CONSTRAINT fkd24b9rwi0exmjxu9ib773fyg0 FOREIGN KEY (id_curriculum_vitae) REFERENCES curriculum_vitae(id),
	CONSTRAINT fknueodjofgakum3vaqr1qs2ftd FOREIGN KEY (id_skills) REFERENCES skills(id)
);

CREATE TABLE public.curriculum_vitae_training (
	id_curriculum_vitae int4 NOT NULL,
	id_training int4 NOT NULL,
	CONSTRAINT uk_316fo73159vn9h04mxbe49808 UNIQUE (id_training),
	CONSTRAINT fkd8edc8qui7q1xeucyovrv8mvf FOREIGN KEY (id_training) REFERENCES training(id),
	CONSTRAINT fkhxv1g3h6p9eb4ewkuvulwk511 FOREIGN KEY (id_curriculum_vitae) REFERENCES curriculum_vitae(id)
);

CREATE TABLE public.curriculum_vitae_work_experience (
	id_curriculum_vitae int4 NOT NULL,
	id_work_experience int4 NOT NULL,
	CONSTRAINT uk_pka7to60n77lv8yxdimgjb3d2 UNIQUE (id_work_experience),
	CONSTRAINT fkexuay31dfn644t3ktlwvhuach FOREIGN KEY (id_work_experience) REFERENCES work_experience(id),
	CONSTRAINT fkh7xdoqf34t588iughuu1rnqnp FOREIGN KEY (id_curriculum_vitae) REFERENCES curriculum_vitae(id)
);

INSERT INTO public.personal_information (address,age,birthdate,"degree",email,last_name,"name",nationality,phone_number,summary,web) VALUES
	 ('Arturo Prat 1237, Santiago, Chile',31,'27-06-1989','Computer Sciences Degree','espinozajgx@gmail.com','Espinoza Ch.','Jose G.','Venezuelan','+56 9 4125 0285','','https://espinozajgch.github.io');

INSERT INTO public.certificates (company,end_year,expires,link,"name",start_year) VALUES
	 ('CertiProf','feb 2023',true,'/certificates/1','Scrum Foundation Professional Certificate','feb 2021'),
	 ('Platzi',NULL,true,'/certificates/2','Curso Profesional de Scrum','feb 2021'),
	 ('Udemy',NULL,false,'/certificates/3','Spring Boot 2 & Spring MVC-Desarrollo web profesional','enero 2021'),
	 ('Platzi',NULL,false,'/certificates/4','Curso Básico de Jenkins','enero 2021'),
	 ('Platzi',NULL,false,'/certificates/5','Curso Básico de Testing en Java','enero 2021'),
	 ('Platzi',NULL,false,'/certificates/6','Curso Profesional de Git y GitHub','enero 2021'),
	 ('Platzi',NULL,false,'/certificates/7','Curso de Docker','enero 2021'),
	 ('Platzi',NULL,false,'/certificates/8','Curso de Introducción a Java SE','enero 2021'),
	 ('Platzi',NULL,false,'/certificates/9','Curso de Introducción a la Terminal y Línea de Comandos','enero 2021'),
	 ('Platzi',NULL,false,'/certificates/10','Curso de Postman','enero 2021'),
	 ('Platzi',NULL,false,'/certificates/11','Curso de Fundamentos Prácticos de Machine Learning','nov 2020'),
	 ('Platzi',NULL,false,'/certificates/12','Curso de Introducción a Machine Learning','nov 2020'),
	 ('Platzi',NULL,false,'/certificates/13','Curso de Python','nov 2020');

INSERT INTO public.training (academic_discipline,"degree",end_year,link,start_year,summary,university) VALUES
	 ('Computing','Higher University Technician','2013','/training/2','2009',NULL,'Juan Pablo Perez Alfonzo University Institute'),
	 ('Entrepreneurship Studies','Entrepreneurship Diploma','2018','/training/3','2017',NULL,'University of Zulia'),
	 ('Computing','Bachelor''s degree','2016','/training/1','2007',NULL,'University of Zulia');

INSERT INTO public.work_experience (active,company,end_year,link,"location","position",start_year,workday) VALUES
	 (false,'Mapcity','jun 2020','/work_experience/2','Santiago, Chile','Software Engineer','may 2019','full time'),
	 (false,'23people','abr 2019','/work_experience/3','Santiago, Chile','Software Developer','oct 2018','full time'),
	 (false,'Fcom','oct 2018','/work_experience/4','Santiago, Chile','Technical Support','ago 2018','full time'),
	 (false,'Insignia Mobile Comunications C.A.','abr 2018','/work_experience/5','Zulia, Venezuela','Software Engineer','feb 2017','full time'),
	 (true,'Equifax Chile S.A.',NULL,'/work_experience/1','Santiago, Chile','Mid-Level Software Engineer','2020','full time');

INSERT INTO public.skills ("name",link) VALUES
	('Java','/skills/1'),
	('Spring','/skills/2'),
	('JavaScript','/skills/3'),
	('Python','/skills/4'),
	('HTML 5','/skills/5'),
	('RestFull','/skills/6'),
	('PHP','/skills/7'),
	('PostgreSQL','/skills/8'),
	('Boostrap','/skills/9'),
	('CSS 3','/skills/10'),
	('GIT','/skills/11'),
	('Docker','/skills/12'),
	('AWS','/skills/13'),
	('Linux','/skills/14'),
	('MySql','/skills/15');

--LLAVES FORANEAS

INSERT INTO public.curriculum_vitae (id_personal_information) VALUES (1);

INSERT INTO public.curriculum_vitae_certificates (id_curriculum_vitae,id_certificates) VALUES
	 (1,1),
	 (1,2),
	 (1,3),
	 (1,4),
	 (1,5),
	 (1,6),
	 (1,7),
	 (1,8),
	 (1,9),
	 (1,10),
	 (1,11),
	 (1,12),
	 (1,13);

INSERT INTO public.curriculum_vitae_skills (id_curriculum_vitae,id_skills) VALUES
	 (1,1),
	 (1,2),
	 (1,3),
	 (1,4),
	 (1,5),
	 (1,6),
	 (1,7),
	 (1,8),
	 (1,9),
	 (1,10),
	 (1,11),
	 (1,12),
	 (1,13),
	 (1,14),
	 (1,15);

INSERT INTO public.curriculum_vitae_training (id_curriculum_vitae,id_training) VALUES
	 (1,1),
	 (1,2),
	 (1,3);

INSERT INTO public.curriculum_vitae_work_experience (id_curriculum_vitae,id_work_experience) VALUES
	 (1,1),
	 (1,2),
	 (1,3),
	 (1,4),
	 (1,5);