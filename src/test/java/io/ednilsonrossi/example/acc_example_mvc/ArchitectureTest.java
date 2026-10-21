package io.ednilsonrossi.example.acc_example_mvc;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

@AnalyzeClasses(packages = "io.ednilsonrossi.example.acc_example_mvc")
public class ArchitectureTest {

    @ArchTest
    static final ArchRule controllerMustNotDependOnRepositories = ArchRuleDefinition.noClasses()
            .that().resideInAPackage("..controller..")
            .should().dependOnClassesThat()
            .resideInAPackage("..repository..");
}
