package Object;

public class Product {
    private String Requested_prod_id, Requested_GTINEANUPC, Requested_Icecat_id, ErrorMessage, Supplier, Prod_id, Icecat_id;
    private String GTIN, Category, CatId, ProductFamily, ProductSeries, Model, Updated, Quality, On_Market, Product_Views, HighPic;
    private String HighPicResolution, LowPic, Pic500x500, ThumbPic, Folder_PDF, Folder_Manual_PDF, ProductTitle, ShortDesc, ShortSummaryDescription;
    private String LongSummaryDescription, LongDesc, ProductGallery1, ProductGalleryResolution, ProductGalleryExpirationDate, _360, EUEnergyLabel;
    private String EUProductFiche, PDF, Videomp4, OtherMultimedia, ProductMultimediaObjectExpirationDate;
    private String ReasonsToBuy, Specs;

    public Product(String requested_prod_id, String requested_GTINEANUPC, String requested_Icecat_id, String errorMessage, String supplier, String prod_id, String icecat_id, String GTIN, String category, String catId, String productFamily, String productSeries, String model, String updated, String quality, String on_Market, String product_Views, String highPic, String highPicResolution, String lowPic, String pic500x500, String thumbPic, String folder_PDF, String folder_Manual_PDF, String productTitle, String shortDesc, String shortSummaryDescription, String longSummaryDescription, String longDesc, String productGallery1, String productGalleryResolution, String productGalleryExpirationDate, String _360, String EUEnergyLabel, String EUProductFiche, String PDF, String videomp4, String otherMultimedia, String productMultimediaObjectExpirationDate, String reasonsToBuy, String specs) {
        Requested_prod_id = requested_prod_id;
        Requested_GTINEANUPC = requested_GTINEANUPC;
        Requested_Icecat_id = requested_Icecat_id;
        ErrorMessage = errorMessage;
        Supplier = supplier;
        Prod_id = prod_id;
        Icecat_id = icecat_id;
        this.GTIN = GTIN;
        Category = category;
        CatId = catId;
        ProductFamily = productFamily;
        ProductSeries = productSeries;
        Model = model;
        Updated = updated;
        Quality = quality;
        On_Market = on_Market;
        Product_Views = product_Views;
        HighPic = highPic;
        HighPicResolution = highPicResolution;
        LowPic = lowPic;
        Pic500x500 = pic500x500;
        ThumbPic = thumbPic;
        Folder_PDF = folder_PDF;
        Folder_Manual_PDF = folder_Manual_PDF;
        ProductTitle = productTitle;
        ShortDesc = shortDesc;
        ShortSummaryDescription = shortSummaryDescription;
        LongSummaryDescription = longSummaryDescription;
        LongDesc = longDesc;
        ProductGallery1 = productGallery1;
        ProductGalleryResolution = productGalleryResolution;
        ProductGalleryExpirationDate = productGalleryExpirationDate;
        this._360 = _360;
        this.EUEnergyLabel = EUEnergyLabel;
        this.EUProductFiche = EUProductFiche;
        this.PDF = PDF;
        Videomp4 = videomp4;
        OtherMultimedia = otherMultimedia;
        ProductMultimediaObjectExpirationDate = productMultimediaObjectExpirationDate;
        ReasonsToBuy = reasonsToBuy;
        Specs = specs;
    }

    public String getRequested_prod_id() {
        return Requested_prod_id;
    }

    public void setRequested_prod_id(String requested_prod_id) {
        Requested_prod_id = requested_prod_id;
    }

    public String getRequested_GTINEANUPC() {
        return Requested_GTINEANUPC;
    }

    public void setRequested_GTINEANUPC(String requested_GTINEANUPC) {
        Requested_GTINEANUPC = requested_GTINEANUPC;
    }

    public String getRequested_Icecat_id() {
        return Requested_Icecat_id;
    }

    public void setRequested_Icecat_id(String requested_Icecat_id) {
        Requested_Icecat_id = requested_Icecat_id;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public String getProd_id() {
        return Prod_id;
    }

    public void setProd_id(String prod_id) {
        Prod_id = prod_id;
    }

    public String getIcecat_id() {
        return Icecat_id;
    }

    public void setIcecat_id(String icecat_id) {
        Icecat_id = icecat_id;
    }

    public String getGTIN() {
        return GTIN;
    }

    public void setGTIN(String GTIN) {
        this.GTIN = GTIN;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getCatId() {
        return CatId;
    }

    public void setCatId(String catId) {
        CatId = catId;
    }

    public String getProductFamily() {
        return ProductFamily;
    }

    public void setProductFamily(String productFamily) {
        ProductFamily = productFamily;
    }

    public String getProductSeries() {
        return ProductSeries;
    }

    public void setProductSeries(String productSeries) {
        ProductSeries = productSeries;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getUpdated() {
        return Updated;
    }

    public void setUpdated(String updated) {
        Updated = updated;
    }

    public String getQuality() {
        return Quality;
    }

    public void setQuality(String quality) {
        Quality = quality;
    }

    public String getOn_Market() {
        return On_Market;
    }

    public void setOn_Market(String on_Market) {
        On_Market = on_Market;
    }

    public String getProduct_Views() {
        return Product_Views;
    }

    public void setProduct_Views(String product_Views) {
        Product_Views = product_Views;
    }

    public String getHighPic() {
        return HighPic;
    }

    public void setHighPic(String highPic) {
        HighPic = highPic;
    }

    public String getHighPicResolution() {
        return HighPicResolution;
    }

    public void setHighPicResolution(String highPicResolution) {
        HighPicResolution = highPicResolution;
    }

    public String getLowPic() {
        return LowPic;
    }

    public void setLowPic(String lowPic) {
        LowPic = lowPic;
    }

    public String getPic500x500() {
        return Pic500x500;
    }

    public void setPic500x500(String pic500x500) {
        Pic500x500 = pic500x500;
    }

    public String getThumbPic() {
        return ThumbPic;
    }

    public void setThumbPic(String thumbPic) {
        ThumbPic = thumbPic;
    }

    public String getFolder_PDF() {
        return Folder_PDF;
    }

    public void setFolder_PDF(String folder_PDF) {
        Folder_PDF = folder_PDF;
    }

    public String getFolder_Manual_PDF() {
        return Folder_Manual_PDF;
    }

    public void setFolder_Manual_PDF(String folder_Manual_PDF) {
        Folder_Manual_PDF = folder_Manual_PDF;
    }

    public String getProductTitle() {
        return ProductTitle;
    }

    public void setProductTitle(String productTitle) {
        ProductTitle = productTitle;
    }

    public String getShortDesc() {
        return ShortDesc;
    }

    public void setShortDesc(String shortDesc) {
        ShortDesc = shortDesc;
    }

    public String getShortSummaryDescription() {
        return ShortSummaryDescription;
    }

    public void setShortSummaryDescription(String shortSummaryDescription) {
        ShortSummaryDescription = shortSummaryDescription;
    }

    public String getLongSummaryDescription() {
        return LongSummaryDescription;
    }

    public void setLongSummaryDescription(String longSummaryDescription) {
        LongSummaryDescription = longSummaryDescription;
    }

    public String getLongDesc() {
        return LongDesc;
    }

    public void setLongDesc(String longDesc) {
        LongDesc = longDesc;
    }

    public String getProductGallery1() {
        return ProductGallery1;
    }

    public void setProductGallery1(String productGallery1) {
        ProductGallery1 = productGallery1;
    }

    public String getProductGalleryResolution() {
        return ProductGalleryResolution;
    }

    public void setProductGalleryResolution(String productGalleryResolution) {
        ProductGalleryResolution = productGalleryResolution;
    }

    public String getProductGalleryExpirationDate() {
        return ProductGalleryExpirationDate;
    }

    public void setProductGalleryExpirationDate(String productGalleryExpirationDate) {
        ProductGalleryExpirationDate = productGalleryExpirationDate;
    }

    public String get_360() {
        return _360;
    }

    public void set_360(String _360) {
        this._360 = _360;
    }

    public String getEUEnergyLabel() {
        return EUEnergyLabel;
    }

    public void setEUEnergyLabel(String EUEnergyLabel) {
        this.EUEnergyLabel = EUEnergyLabel;
    }

    public String getEUProductFiche() {
        return EUProductFiche;
    }

    public void setEUProductFiche(String EUProductFiche) {
        this.EUProductFiche = EUProductFiche;
    }

    public String getPDF() {
        return PDF;
    }

    public void setPDF(String PDF) {
        this.PDF = PDF;
    }

    public String getVideomp4() {
        return Videomp4;
    }

    public void setVideomp4(String videomp4) {
        Videomp4 = videomp4;
    }

    public String getOtherMultimedia() {
        return OtherMultimedia;
    }

    public void setOtherMultimedia(String otherMultimedia) {
        OtherMultimedia = otherMultimedia;
    }

    public String getProductMultimediaObjectExpirationDate() {
        return ProductMultimediaObjectExpirationDate;
    }

    public void setProductMultimediaObjectExpirationDate(String productMultimediaObjectExpirationDate) {
        ProductMultimediaObjectExpirationDate = productMultimediaObjectExpirationDate;
    }

    public String getReasonsToBuy() {
        return ReasonsToBuy;
    }

    public void setReasonsToBuy(String reasonsToBuy) {
        ReasonsToBuy = reasonsToBuy;
    }

    public String getSpecs() {
        return Specs;
    }

    public void setSpecs(String specs) {
        Specs = specs;
    }

}
