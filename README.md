# Zoom API

visit https://marketplace.zoom.us/docs/api-reference/zoom-api for the official documentation on the Zoom API.

## Gererating JWT token

    - Go to https://marketplace.zoom.us/develop/create
    - Select JWT as your app type
    - Fill in the required details
    - In the App Credential section, click on View JWT Token
    - You can select a custom expiry date for this token, then copy the token

For more info refer:
    https://marketplace.zoom.us/docs/guides/auth/jwt



##### Controller
Contains all the REST endpoints.
##### Service
Contains the service class which takes care of the main functionalitoes, like making the API call and processing the data.
##### Model 
Contains all the POJO classes required for making the request and accepting the response.
##### test
Contains JUnit tests for all the classes.


