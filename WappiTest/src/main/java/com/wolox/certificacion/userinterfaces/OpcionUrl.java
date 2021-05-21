package com.wolox.certificacion.userinterfaces;

    
    public enum OpcionUrl {
    	
	    PAGINA_WAPPI("https://automation-wappi.vercel.app/login");

	    private final String url;

	    OpcionUrl(String url) {
	        this.url = url;
	    }

	    public String url() {
	        return url;
	    }
	}


