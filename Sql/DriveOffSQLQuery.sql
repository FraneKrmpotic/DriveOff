create database DriveOffDatabase
go

use DriveOffDatabase
go

----------------------------------------------
-------------------USER-----------------------
----------------------------------------------

CREATE table AppUser(
	IDUser int primary key identity,
	Username nvarchar(50) NOT NULL,
	Email nvarchar(50) NOT NULL,
	Password nvarchar(max) NOT NULL,
	Active bit NOT NULL
)
go


----------------------------------------------
--------------AppUser CRUD--------------------

create proc createUser
	@Username nvarchar(50),
	@Email nvarchar(50),
	@Password nvarchar(max),
	@Active bit,
	@IDUser int output
as
begin
	insert into AppUser (Username, Email, Password, Active) values (@Username, @Email, @Password, @Active)
	set @IDUser = SCOPE_IDENTITY()
end
go

create proc selectUsers 
as
begin 
	select u.IDUser, u.Email, u.Username, u.Password, u.Active
	from AppUser as u
end
go

create proc selectUser
	@IDUser int
as
begin 
	select u.IDUser, u.Email, u.Username, u.Password, u.Active
	from AppUser as u
	where IDUser = @IDUser
end
go

create proc updatePassword
	@Password nvarchar(max),
	@IDUser int 
as
begin
	update AppUser set
		Password = @Password
	where IDUser = @IDUser
end
go

create proc deleteUser
	@IDUser int
as
begin
	update AppUser set
		Active = 0
	where IDUser = @IDUser
end
go


----------------------------------------------
-----------------COMPANY----------------------
----------------------------------------------

CREATE table AppCompany(
	IDCompany int primary key identity,
	CompanyName nvarchar(50) NOT NULL,
	Email nvarchar(50) NOT NULL,
	Password nvarchar(max) NOT NULL,
	Active bit NOT NULL
)
go


----------------------------------------------
-------------AppCompany CRUD------------------

create proc createCompany
	@CompanyName nvarchar(50),
	@Email nvarchar(50),
	@Password nvarchar(max),
	@Active bit,
	@IDUser int output
as
begin
	insert into AppCompany (CompanyName, Email, Password, Active) values (@CompanyName, @Email, @Password, @Active)
	set @IDUser = SCOPE_IDENTITY()
end
go

create proc  selectCompanies 
as
begin 
	select u.IDCompany, u.Email, u.CompanyName, u.Password, u.Active
	from AppCompany as u
end
go

create proc selectCompany
	@IDCompany int
as
begin 
	select u.IDCompany, u.Email, u.CompanyName, u.Password, u.Active
	from AppCompany as u
	where IDCompany = @IDCompany
end
go

create proc updateCompanyPassword
	@Password nvarchar(max),
	@IDCompany int 
as
begin
	update AppCompany set
		Password = @Password
	where IDCompany = @IDCompany
end
go

create proc deleteCompany
	@IDCompany int
as
begin
	update AppCompany set
		Active = 0
	where IDCompany = @IDCompany
end
go



----------------------------------------------
--------------------CAR-----------------------
----------------------------------------------


create table Car(
	IDCar int primary key identity,
	CarName nvarchar(50) NOT NULL,
	CarType nvarchar(50) NOT NULL,
	Summary nvarchar(500) NOT NULL,
	ImageBlob nvarchar(max),
	AppCompanyID int foreign key references AppCompany(IDCompany)

)
go

----------------------------------------------
-----------------Car CRUD---------------------

create proc createCar
	@CarName nvarchar(50),
	@CarType nvarchar(50),
	@Summary nvarchar(500),
	@ImageBlob nvarchar(max),
	@AppCompanyID int,
	@IDCar int output
as
begin
	insert into Car(CarName, CarType, Summary, ImageBlob, AppCompanyID) values (@CarName, @CarType, @Summary, @ImageBlob, @AppCompanyID)
	set @IDCar = SCOPE_IDENTITY()
end
go

create proc selectCars 
as
begin 
	select c.IDCar, c.CarName, c.CarType, c.Summary, c.ImageBlob, c.AppCompanyID
	from Car as c
end
go

create proc selectCar
	@IDCar int
as
begin 
	select c.IDCar, c.CarName, c.CarType, c.Summary, c.ImageBlob, c.AppCompanyID
	from Car as c
	where IDCar = @IDCar
end
go


create proc deleteCar
	@IDCar int
as
begin
	delete Car
	where IDCar = @IDCar
end
go




----------------------------------------------
----------------Reservation-------------------
----------------------------------------------


create table Reservation(
	IDReservation int primary key identity,
	ReservationDate datetime NOT NULL,
	Price float NOT NULL,
	AppUserID int foreign key references AppUser(IDUser),
	CarID int foreign key references Car(IDCar)

)
go

----------------------------------------------
-------------Reservation CRUD-----------------

create proc createReservation
	@ReservationDate datetime,
	@Price float,
	@AppUserID int,
	@CarID int,
	@IDReservation int output
as
begin
	insert into Reservation(ReservationDate, Price, AppUserID, CarID) values (@ReservationDate, @Price, @AppUserID, @CarID)
	set @IDReservation = SCOPE_IDENTITY()
end
go

create proc selectReservations 
as
begin 
	select r.IDReservation, r.ReservationDate, r.Price, r.AppUserID, r.CarID
	from Reservation as r
end
go

create proc selectReservation
	@IDReservation int
as
begin 
	select r.IDReservation, r.ReservationDate, r.Price, r.AppUserID, r.CarID
	from Reservation as r
	where IDReservation = @IDReservation
end
go


create proc deleteReservation
	@IDReservation int
as
begin
	delete Reservation
	where IDReservation = @IDReservation
end
go



