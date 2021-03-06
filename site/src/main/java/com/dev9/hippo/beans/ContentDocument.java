package com.dev9.hippo.beans;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.components.rest.adapters.HippoHtmlAdapter;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Calendar;

@XmlRootElement(name = "contentdocument")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "hipposwaggerint:contentdocument")
@Node(jcrType = "hipposwaggerint:contentdocument")
@ApiModel(description = "A simple content document provided by Essentials.")
public class ContentDocument extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "hipposwaggerint:introduction")
    @ApiModelProperty("Document introductory text")
    public String getIntroduction() {
        return getProperty("hipposwaggerint:introduction");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "hipposwaggerint:title")
    @ApiModelProperty("Document title")
    public String getTitle() {
        return getProperty("hipposwaggerint:title");
    }

    @XmlJavaTypeAdapter(HippoHtmlAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "hipposwaggerint:content")
    @ApiModelProperty(value = "Document content", dataType = "java.lang.String")
    public HippoHtml getContent() {
        return getHippoHtml("hipposwaggerint:content");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "hipposwaggerint:publicationdate")
    @ApiModelProperty(value = "Date published", dataType = "java.lang.Long")
    public Calendar getPublicationDate() {
        return getProperty("hipposwaggerint:publicationdate");
    }


}
