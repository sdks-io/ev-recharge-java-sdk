
# Not Found Err Msg

## Structure

`NotFoundErrMsg`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Error code | String getCode() | setCode(String code) |
| `Message` | `String` | Optional | Error desctiption in English | String getMessage() | setMessage(String message) |
| `Description` | `String` | Optional | Technical details of the error message, the example which is given in the sample payload is one of the scenarios. actual response will vary based on the technical nature | String getDescription() | setDescription(String description) |
| `Details` | `List<String>` | Optional | - | List<String> getDetails() | setDetails(List<String> details) |

## Example

```java
import com.shell.apitest.models.NotFoundErrMsg;
import java.util.Arrays;

NotFoundErrMsg notFoundErrMsg = new NotFoundErrMsg.Builder()
    .code("E0038")
    .message("Not Found")
    .description("Requested API resource not found")
    .details(Arrays.asList(
        "details7"
    ))
    .build();
```

