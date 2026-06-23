package com.mindu;


import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {


WebDriver driver;


@BeforeEach
void iniciar(){

driver = new ChromeDriver();

}


@Test
void validarPaginaMindu(){


driver.get(
"http://localhost:8080"
);


String titulo =
driver.getTitle();


Assertions.assertTrue(
titulo.contains("MINDU")
);


}


@AfterEach
void cerrar(){

driver.quit();

}


}