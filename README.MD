# Serenity Starter project

## Use Gradle

Open a command window and run:

    ./gradlew test
    gradlew test -Denvironment=qa
    gradlew test -Denvironment=pre

## Running tests by tags     

    ./gradlew clean test -Dtags='login' -Denvironment=qa

## Run in firefox

    ./gradlew clean test -Pwebdriver.driver=firefox


## Run in Remote - Selenoid

    ./gradlew clean test -Dtags='login' -Denvironment=qa -Dwebdriver.remote.url=http://127.0.0.1:4444/wd/hub -Dwebdriver.remote.driver=chrome -Dserenity.driver.capabilities=enableVNC:true -Dwebdriver.remote.timeouts.implicitlywait=30000 -Dwebdriver.remote.timeouts.fluentwait=10000


## Viewing the reports

Both of the commands provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!

