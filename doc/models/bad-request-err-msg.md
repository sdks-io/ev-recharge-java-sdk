
# Bad Request Err Msg

## Structure

`BadRequestErrMsg`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Error code | String getCode() | setCode(String code) |
| `Message` | `String` | Optional | Error desctiption in English | String getMessage() | setMessage(String message) |
| `Description` | `String` | Optional | Technical details of the error message, the example which is given in the sample payload is one of the scenarios. actual response will vary based on the validation error | String getDescription() | setDescription(String description) |
| `Details` | `List<String>` | Optional | - | List<String> getDetails() | setDetails(List<String> details) |

## Example

```java
import com.shell.apitest.models.BadRequestErrMsg;
import java.util.Arrays;

BadRequestErrMsg badRequestErrMsg = new BadRequestErrMsg.Builder()
    .code("E0001")
    .message("Bad Request")
    .description("Authorization header is missing")
    .details(Arrays.asList(
        "details3"
    ))
    .build();
```

