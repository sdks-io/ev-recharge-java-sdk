
# Ratelimit Err Msg

## Structure

`RatelimitErrMsg`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Error code | String getCode() | setCode(String code) |
| `Message` | `String` | Optional | Error desctiption in English | String getMessage() | setMessage(String message) |
| `Description` | `String` | Optional | Technical details of the error message, the example which is given in the sample payload is one of the scenarios. actual response will vary based on the technical nature | String getDescription() | setDescription(String description) |
| `Details` | `List<String>` | Optional | - | List<String> getDetails() | setDetails(List<String> details) |

## Example

```java
import com.shell.apitest.models.RatelimitErrMsg;
import java.util.Arrays;

RatelimitErrMsg ratelimitErrMsg = new RatelimitErrMsg.Builder()
    .code("E0009")
    .message("Too Many Requests")
    .description("Exceeded maximum allowed number of request limit")
    .details(Arrays.asList(
        "details3",
        "details4",
        "details5"
    ))
    .build();
```

