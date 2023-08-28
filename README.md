# Spring Boot Learning Project

This is learning project for Spring Boot. Initial idea is to create weather forecast service.

## How we work

* Every task described as an issue.
* In order to solve the issue separate branch has been created.
* Once implementation is ready Pull request must be opened against `main` branch.
* When the PR approved `squash & merge` must be used to merge the PR.

### CI

* We are going to write JUnit tests and run them on every PR.

### CD

* Once `main` branch updated, the application will be deployed to `Heroku` application and will be available [there](https://spring-boot-learning-59526da0061b.herokuapp.com/).
