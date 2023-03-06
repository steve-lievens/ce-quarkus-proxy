# Openshift Deployment

The easiest way to deploy this application is to navigate into this folder (java-version or native-version) and then issue :
(you can use a different project name if you want)

```
oc new-project quarkus-java
oc apply -f .
```

After the build process has completed, the application will be running and connected to the quarkus-book deployment.
(If you are not running it, you'll need it for this one. You can find it here : https://github.com/steve-lievens/ce-quarkus-book)

You can now connect to the deployment service with these endpoints :

http://quarkus-proxy:8080/api/proxy/books
http://quarkus-proxy:8080/api/proxy/publishers
http://quarkus-proxy:8080/api/proxy/pubfrombook
