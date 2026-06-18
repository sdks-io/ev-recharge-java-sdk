
# Serviceunavailable Err Msg

## Structure

`ServiceunavailableErrMsg`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Error code | String getCode() | setCode(String code) |
| `Message` | `String` | Optional | Error desctiption in English | String getMessage() | setMessage(String message) |
| `Description` | `String` | Optional | Technical details of the error message, the example which is given in the sample payload is one of the scenarios. actual response will vary based on the technical nature | String getDescription() | setDescription(String description) |
| `Details` | `List<String>` | Optional | - | List<String> getDetails() | setDetails(List<String> details) |

## Example

```java
import com.shell.apitest.models.ServiceunavailableErrMsg;
import java.util.Arrays;

ServiceunavailableErrMsg serviceunavailableErrMsg = new ServiceunavailableErrMsg.Builder()
    .code("E0014")
    .message("Connectivity Error")
    .description("Service Unavailable")
    .details(Arrays.asList(
        "details5",
        "details6",
        "details7"
    ))
    .build();
```

