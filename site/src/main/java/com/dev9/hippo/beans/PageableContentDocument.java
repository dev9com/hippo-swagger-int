package com.dev9.hippo.beans;

import io.swagger.annotations.ApiModelProperty;
import org.onehippo.cms7.essentials.components.paging.DefaultPagination;

import java.util.List;

/**
 * Used for ApiDocumentation - Swagger has difficulty with generics
 */
public class PageableContentDocument extends DefaultPagination<ContentDocument> {
    public PageableContentDocument(List<ContentDocument> items) {
        super(items);
    }
}
