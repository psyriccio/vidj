#!/bin/bash
./gradlew clean
./gradlew mkRelease
rm -f ./vidj.jar
cp ./$(cat ./lastbuild) ./vidj.jar
