package com.dev9.hippo.beans;

import io.swagger.annotations.ApiModel;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;

@Node(jcrType = "hipposwaggerint:basedocument")
@ApiModel
public class BaseDocument extends HippoDocument {
}
