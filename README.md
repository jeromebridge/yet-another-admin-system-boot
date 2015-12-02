![Yaas logo](documentation/files/yaas-logo.png "Yaas logo")

### Introduction

Project that allows user to boot up the Yet Another Admin System

### Requirements

All you need is a copy of [gradle](http://gradle.org/) and [docker](http://docker.com/)


### Getting Started

* Run the database in docker...

````
sudo docker run -d --name=db -p 5432:5432 -e USER="super" -e DB="yaas" -e PASS="postgres" -e POSTGRES_PASS="postgres" pennassurancesoftware/postgresql
````

* Clone this git repository...

<code>git clone https://github.com/jeromebridge/yet-another-admin-system-boot.git</code>

* To download, install, and run Yaas

<code>./gradlew setupVirgo runVirgo</code>

* Navigate to the Yaas Home Page with this link: <a href="http://localhost:8080/yweb">http://localhost:8080/yweb</a>

* Navigate to the Virgo Admin Console with this link: <a href="http://localhost:8080/admin">http://localhost:8080/admin</a>

    user: **admin** password: **springsource**

### Development Mode

If you want to run Yaas as a developer with Eclipse use the following steps:

1. Setup Eclipse
2. Import all of the projects from the jeromebridge/yet-another-admin-system repository
3. Run the Virgo container without Yaas from this directory

<code>./gradlew setupVirgoNoYaas runVirgo</code>

5. SSH to the running Virgo Server

<code>ssh admin@localhost -p2502</code>

4. Deploy the application using the `m2e:deploy` command

<code>m2e:deploy -r /home/developer/git/yet-another-admin-system</code>

