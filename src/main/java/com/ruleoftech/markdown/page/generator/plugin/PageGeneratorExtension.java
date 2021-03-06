package com.ruleoftech.markdown.page.generator.plugin;

import com.vladsch.flexmark.Extension;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.util.options.DataKey;
import com.vladsch.flexmark.util.options.MutableDataHolder;

public class PageGeneratorExtension implements HtmlRenderer.HtmlRendererExtension {
    final static public DataKey<String> INPUT_FILE_EXTENSION = new DataKey<String>("INPUT_FILE_EXTENSION", "md");

    @Override
    public void rendererOptions(final MutableDataHolder options) {

    }

    @Override
    public void extend(HtmlRenderer.Builder rendererBuilder, String rendererType) {
        rendererBuilder.linkResolverFactory(new FlexmarkLinkResolver.Factory());
    }

    public static Extension create() {
        return new PageGeneratorExtension();
    }
}
