public class TableContentHandler implements ContentHandler {

    // key = abbreviation
    // value = information / description for abbreviation
    private Map<String, String> abbreviations = new HashMap<String, String>();

    // current abbreviation
    private String abbreviation = null;

    // <dd> element contains abbreviation. So this boolean variable will be set when
    // <dd> element is found
    private boolean ddElementStarted = false;

    // this method is not giving contents within <dd> and </dd> tags
    public void characters(char[] chars, int arg1, int arg2) throws SAXException {
            if(ddElementStarted) {
                    System.out.println("chars found...");
            }
    }

    // set boolean ddElementStarted to true to indicate that content handler found 
    // <dd> element
    public void startElement(String arg0, String element, String arg2, Attributes arg3) throws SAXException {
            if(element.equalsIgnoreCase("dd")) {
                    ddElementStarted = true;
            }
    }
}