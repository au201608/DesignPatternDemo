package PrototypePattern;

/**
 * Created by thuang on 2/7/17.
 */
public class NDAgreement extends PrototypeCapableDocument {
    private AuthorizedSignatory authorizedSignatory;

    public AuthorizedSignatory getAuthorizedSignatory() {
        return authorizedSignatory;
    }

    public void setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory) {
        this.authorizedSignatory = authorizedSignatory;
    }

    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        /* Clone with deep copy */
        NDAgreement nda;
        nda = (NDAgreement) super.clone();
        AuthorizedSignatory cloneAuthorizedSignatory = (AuthorizedSignatory) nda.getAuthorizedSignatory().clone();
        nda.setAuthorizedSignatory(cloneAuthorizedSignatory);
        return nda;
    }

    @Override
    public String toString() {
        return "[NDAgreement: Vendor Name - " + getVendorName() + ", Content - " + getContent() + ", Authorized Signatory - " + getAuthorizedSignatory() + "]";
    }

}
