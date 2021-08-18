## Release
    mvn release:clean release:prepare release:perform

## Build jar file
    mvn clean package

## Build immagine Docker

    docker image build -t traceapp:0.0.1 .

## Test servizio

    curl -X POST -H "Content-Type: application/json" -d '{ "messageId":"de461a83-fc74-4660-93ed-1b609ecfac23", "correlationId":"de461a83-fc74-4660-93ed-1b609ecfac23", "username":"username", "consumerKey":"NHFJ8iff45P7Z0KXhBtVLv9NLsEa", "httpMethod":"POST", "httpResource":"http://electrocommerce.org/abc", "soapAction":"http://electrocommerce.org/abc#MyMessage", "remoteAddress":"127.0.0.1", "applicationCode":"ss", "direction":"OUT", "httpStatusCode":200, "errorCode":"401", "errorMessage":"ERRORE", "apiGatewayAddress":"0.0.0.0" }' http://127.0.0.1:8080/traceapp/access

## Test Actuator
    curl -X GET -H http://127.0.0.1:8080/traceapp/actuator/health
