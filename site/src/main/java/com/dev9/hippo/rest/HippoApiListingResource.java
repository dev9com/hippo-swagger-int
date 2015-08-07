package com.dev9.hippo.rest;

import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import io.swagger.converter.ModelConverters;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.util.Json;

public class HippoApiListingResource extends ApiListingResource {

    public HippoApiListingResource() {

        ModelConverters.getInstance().addPackageToSkip("org.hippoecm"); //skip hippo classes - only use the beans we create
        ModelConverters.getInstance().addPackageToSkip("org.onehippo"); //skip more hippo classes - only use the beans we create
        ModelConverters.getInstance().addPackageToSkip("javax"); //skip security classes
        Json.mapper().registerModule(new JaxbAnnotationModule()); //works around bug in Swagger 1.5.0 - they don't respect XmlAccessorType annotations
    }
}
