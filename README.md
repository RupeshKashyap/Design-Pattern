Java Design Pattern

1. Singleton 
2. Factory
3. Builder




1. Singleton Desing Pattern
	1. Properties
		a. Creational Design Pattern
		b. Only one instance should be exist
		c. Other classes should be able to get instance of singleton classes
		d. Used in Looging,cache , Session , Driver(DB connection)
		
	2. Singleton desing pattern : implementation
		a. Constructor should be private
		b. Public methd for returning instance
		c. Instance type : static private
	
	3. Initialisation Type 
		a. Eager initialisation : when class will called that time only create the instance.
		b. Lazy initialisation : when class will called check object is null, only and only if object is null create new instance(Not thread safe)
		c. Thread Safe Method initialisation : if at the same time two user will call the lazy(Singleton) it may create two object so we can defile synchronize method
		d. Thread Safe Block initialisation : if block will synchronize it will bw more usefull for multiple user. once object is create not to wait for other user.
	


2. Factory Desing Pattern 
	1. Properties 
		a. Creational Design Pattern
		b. Used when we have multiple sub classes of a super class & bases on input we want to return on class instance
		c. It provides abstraction between implementation and client class.
		d. Remove the instantiation of client class from the client code 
		
	2. implementation
		a. Super class can be interface,abstract class or basic class.
		b. factory class has static method which returns instance of sub-class based on input

3. Builder Design Pattern
	1. Properties
		a. Creational desing pattern
		b. Used when we have too many argument to sent in constructor & it's hard to maintain the order.
		c. When we don't want to send all parameter in object installation (Generally we send optional parameter as null)
		
	2. implementation
			a. we create a "static nested class" which contain all argument of outer class.
			b. As per the naming convention if class name is "Vehicle" , builder class will be "VehicleBuilder".
			c. Builder class have public constructor with all required parameter.
			d. Builder class should have method for optional parameter. Method will return Buildr object.
			e. A "build()" will return final object 
			f. The main class "Vehicle" has private constructor so create instance only via builder class
			g. The main class "Vehicle" has only getter method.