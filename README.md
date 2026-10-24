"# OrderManagementApplication" 
### Build and Run

To build the project and run tests, use the following Maven command:

mvn clean install

### Docker Build

To build the Docker image for the project, run command:

docker build -t ordermgmt:v1 .

### Running the Container

To run the containerized application, use the following command:

docker run -d -p 8080:8080 --name order-management-service ordermgmt:v1


