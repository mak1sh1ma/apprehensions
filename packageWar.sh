#!/bin/bash
sudo chown -R ubuntu:ubuntu /home/ubuntu/metrotraffic
cd /home/ubuntu/metrotraffic
mvn clean install
sudo mv target/MetroTraffic.war /var/lib/tomcat7/webapps/MetroTraffic.war