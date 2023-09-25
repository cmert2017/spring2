package com.cydeo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan //this is just checking all the classes inside the package which is mentioned at the top of this class.
@ComponentScan(basePackages = "com.cydeo") // by this we can decide the which packages can be checked by sprint for @component annotaitons
public class ConfigCourse {

//one of the difference between @bean and  @component is @bean is used when the class is not yours like Strign class


}
