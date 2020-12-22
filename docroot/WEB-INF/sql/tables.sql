create table manageEmployer_Department (
	idDept INTEGER not null primary key,
	nameDept VARCHAR(75) null
);

create table manageEmployer_Employer (
	idEmployer INTEGER not null primary key,
	nameEmployer VARCHAR(75) null,
	idDept INTEGER,
	photo VARCHAR(75) null
);