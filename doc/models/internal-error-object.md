
# Internal Error Object

## Structure

`InternalErrorObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Error code | String getCode() | setCode(String code) |
| `Message` | `String` | Optional | Error description in English | String getMessage() | setMessage(String message) |
| `Description` | `String` | Optional | Technical details of the error message, the example which is given in the sample payload is one of the scenario. actual response will vary based on the technical nature | String getDescription() | setDescription(String description) |

## Example

```java
import com.shell.apitest.models.InternalErrorObject;

InternalErrorObject internalErrorObject = new InternalErrorObject.Builder()
    .code("E0005")
    .message("Internal Server Error")
    .description("Server encountered an unexpected condition that prevented it from fulfilling the request")
    .build();
```

