set -e
#./build_web.sh
cd news-feeder-web
mvn wildfly:deploy-only -Dwildfly.hostname=localhost -Dwildfly.password=q1w2e3r4t5y6 -Dwildfly.username=demo-user -Dwildfly.port=9990
cd ../




