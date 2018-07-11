# Spring-Tutorials

###### Core Container:
The Core Container consists of the Core, Beans, Context and Expression modules.
The Core and Beans modules provide IoC and Dependency Injection features.
In Core Module, Customer bean is injected with Setter & Constructor based DI.

###### Data Access/Integration:
The Data Access/Integration layer consists of the JDBC, ORM, OXM, JMS and Transaction modules.
ORM module provides intergration layers for Object-Relation-Mapping.
JMS module supports Java Messaging Service.

###### AOP:
AOP module allows you to define method-interceptors & pointcuts to decouple actual functionality.
Each Interceptor is going to invoke before making any call to any method of CustomerService.
This dependency "cglib:cglib:2.2.2" supports Proxy behaviour.

###### SpringBatchExample:
This example will give you idea about Spring batch processing.
"report.csv" file have some data, "CsvFileItemReader" will read line by line and pass it to "CustomerItemProcessor".
"Main.java" this is a main class.
