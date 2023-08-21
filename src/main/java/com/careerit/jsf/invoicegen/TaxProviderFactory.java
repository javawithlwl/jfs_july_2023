package com.careerit.jsf.invoicegen;

public class TaxProviderFactory {

        public static TaxServiceProvider getTaxProvider(String countryCode){
            return switch (countryCode){
                case "IND"->new IndTaxServiceProvider();
                case "USA" -> new USTaxServiceProvider();
                case "SG" -> new SgTaxServiceProvider();
                default -> throw new IllegalArgumentException("There is no tax provider for the given country");
            };
        }
}
