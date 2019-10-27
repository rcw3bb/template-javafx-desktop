# Build

### Pre-requisite

* Java 12
* Gradle 5.3x

### Procedure

1. Create or update **<USER_HOME>\\.gradle\\gradle.properties** to have the following properties:

    ```properties
    archivaUsername=<VALID_USERNAME>
    archivaPassword=<VALID_PASSWORD>
    ```

2. Run following gradle command from **template-desktop directory**:
	```
	gradle packWin
	```
	
	> If the command completed successfully, it has generated a **build directory**. And from it, the package is inside the **pack directory**.
