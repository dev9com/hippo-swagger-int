/*
 * Copyright 2014 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dev9.hippo.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.onehippo.cms7.essentials.components.paging.Pageable;
import org.onehippo.cms7.essentials.components.rest.BaseRestResource;
import org.onehippo.cms7.essentials.components.rest.ctx.DefaultRestContext;
import com.dev9.hippo.beans.ContentDocument;

/**
 * @version "$Id$"
 */

@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_FORM_URLENCODED})
@Path("/ContentDocument/")
@Api(value ="/ContentDocument", description = "ContentDocument REST Operations")
public class ContentDocumentResource extends BaseRestResource {


    @GET
    @Path("/")
    @ApiOperation(value = "Get all ContentDocument beans.", response = ContentDocument.class)
    public Pageable<ContentDocument> index(@Context HttpServletRequest request) {
        return findBeans(new DefaultRestContext(this, request), ContentDocument.class);
    }

    @GET
    @Path("/page/{page}")
    @ApiOperation(value = "Get page of ContentDocument beans.", response = ContentDocument.class)
    public Pageable<ContentDocument> page(@Context HttpServletRequest request, @PathParam("page") int page) {
        return findBeans(new DefaultRestContext(this, request, page, DefaultRestContext.PAGE_SIZE), ContentDocument.class);
    }


    @GET
    @Path("/page/{page}/{pageSize}")
    @ApiOperation(value = "Get page of ContentDocument beans with specified page size.", response = ContentDocument.class)
    public Pageable<ContentDocument> pageForSize(@Context HttpServletRequest request, @PathParam("page") int page, @PathParam("pageSize") int pageSize) {
        return findBeans(new DefaultRestContext(this, request, page, pageSize), ContentDocument.class);
    }


}
