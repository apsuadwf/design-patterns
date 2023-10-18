package org.ytmf.creational.builder;

/**
 * 创建者设计模式常用案例
 *
 * @author XieRongji
 * @date 2023/10/18 16:36
 **/

public class HTMLDocument {
    /*
        HTML 头部
     */
    private String header = "";

    private String body = "";
    private String footer = "";

    public void addHeader(String header){
        this.header = header;
    }
    public void addBody(String body){
        this.body = body;
    }

    public void addFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "<html><head>" + header + "</head><body>" + body + "</body><footer>" + footer + "</footer></html>";
    }

    public static class Builder {
        protected HTMLDocument document;

        public Builder() {
            this.document = new HTMLDocument();
        }

        public Builder addHeader(String header) {
            document.addHeader(header);
            return this;
        }

        public Builder addBody(String body) {
            document.addBody(body);
            return this;
        }

        public Builder addFooter(String footer) {
            document.addFooter(footer);
            return this;
        }
        public HTMLDocument build() {
            return document;
        }
    }
}
