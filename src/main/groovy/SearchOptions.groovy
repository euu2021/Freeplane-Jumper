package lilive.jumper


class SearchOptions {
    
    boolean useRegex = false
    boolean caseSensitive = false
    boolean fromStart = false
    boolean splitPattern = true
    boolean transversal = true
    boolean useDetails = true
    boolean useNote = false
    boolean useAttributesName = false
    boolean useAttributesValue = false

    public boolean allDetailsTrue(){
        return useDetails && useNote && useAttributesName && useAttributesValue
    }

    public boolean allDetailsFalse(){
        return ! ( useDetails || useNote || useAttributesName || useAttributesValue )
    }
}
