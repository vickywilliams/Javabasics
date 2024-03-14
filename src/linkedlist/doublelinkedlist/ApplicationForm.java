package linkedlist.doublelinkedlist;


import java.text.DateFormat.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ApplicationForm {

private String title;
private List<Field> fields;
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public List<Field> getFields() {
return fields;
}

public void setFields(List<Field> fields) {
this.fields = fields;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}