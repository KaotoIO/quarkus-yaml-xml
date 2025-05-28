# Kaoto - Camle extensions for Quarkus with YAML and XML DSLs

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Motivation
This project showcase the use of Camel Quarkus extensions for YAML and XML DSLs. It allows users to define routes in YAML or XML format, which can be useful for those who prefer these formats over Java code.

* [XML IO Route](src/main/resources/routes/timer-xml.camel.xml)
* [YAML Route](src/main/resources/routes/timer.camel.yaml)

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

## Related Guides

- Camel Core ([guide](https://docs.redhat.com/en/documentation/red_hat_build_of_apache_camel/4.10/html-single/red_hat_build_of_apache_camel_for_quarkus_reference/camel-quarkus-extensions-reference#extensions-core)): Camel core functionality and basic Camel languages: Constant, ExchangeProperty, Header, Ref, Simple and Tokenize
- Camel XML IO DSL ([guide](https://docs.redhat.com/en/documentation/red_hat_build_of_apache_camel/4.10/html-single/red_hat_build_of_apache_camel_for_quarkus_reference/camel-quarkus-extensions-reference#extensions-xml-io-dsl)): An XML stack for parsing XML route definitions
- Camel YAML DSL ([guide](https://docs.redhat.com/en/documentation/red_hat_build_of_apache_camel/4.10/html-single/red_hat_build_of_apache_camel_for_quarkus_reference/camel-quarkus-extensions-reference#extensions-yaml-dsl)): An YAML stack for parsing YAML route definitions
