Notes: https://drive.google.com/file/d/1WsrfjzPwtE1d-z94SeVRdOscReeliPQN/view?usp=sharing

Project Setup
-------------

- Create project here [Spring Boot Starter](https://start.spring.io)
- Dependencies
    + all dev (lombok, dev, config)
    + web mvc
    + data-rest
    + jpa (lombok)
    + postgresql driver
    + spring security
    + spring sessions
- download the zip, open in your editor
- setup DB config in `uber/src/main/resources/application.properties`

DB Setup for Local Dev
----------------------

Enter the postgres shell: `sudo -u postgres psql`
List users (in psql) `\l`
List databases (in psql) `\du`
Quit the psql shell `\q`

Create a new DB (in psql) `CREATE DATABASE uber;`
Delete a new DB (in psql) `DROP DATABASE uber;`

Create a new user with password and db create-write and superuser permissions (shell): `sudo -u postgres createuser -d -l -s -P uberadmin`
Delete user (shell) `sudo -u postgres dropuser username`

Other Notes
-----------

```py
class Driver:
    @OneToOne
	account: Account   # in the driver table, create a col account_id

    @OneToMany
	bookings: [Booking]  # bookings table, driver_id
    # Rohan.bookings()
    # GET * from Booking
    # where user_id = RohanId

class Passenger:
    account: Account
    bookings: [Booking]

class Account:
	# can be for a driver
    # can be for a passenger

class Booking:
    @ManyToOne
    driver: Driver
    passenger: Passenger
```

Driver 1 - * Booking
Passenger 1 - * Booking
Driver 1 - 1 Account
Passenger 1 - 1 Account



Python - SQLAlchemy ORM - forces you to define relations both ways
Django ORM - allows you to define one way relations


ORM is just an abstractions
DBs are truth tables with constraints

every row in a table denotes a truth
