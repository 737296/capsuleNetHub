webpackJsonp([0],{psbz:function(e,t,a){"use strict";var r=a("gyMJ"),n=a("h0OX");t.a={queryTable:function(e){return r.a.post(n.a.QUERY_APPLICATION_LIST,e)},updateData:function(e,t){return t.isEdit?r.a.post(n.a.UPDATE_USER_DATA,e):r.a.post(n.a.ADD_USER_DATA,e)},delData:function(e){return r.a.post(n.a.DEL_USER_DATA,e,{confirm:{}})},addBusinesslicense:function(e){return r.a.post(n.a.ADD_Businesslicense,e)},addformtest:function(e){return r.a.post(n.a.addformtest,e)},addAllformtest:function(e){return r.a.post(n.a.addAllformtest,e)},queryAccountBooksList:function(e){return r.a.post(n.a.QUERY_ACCOUNTBOOKS_LIST,e)},addaccountbooks:function(e){return r.a.post(n.a.addaccountbooks,e)},queryMerchantDetail:function(e){return r.a.post(n.a.queryMerchantDetail,e)},Checkallamount:function(e){return r.a.post(n.a.Checkallamount,e)}}},t5DY:function(e,t,a){"use strict";a.d(t,"b",function(){return i});var r=a("//Fk"),n=a.n(r),o=a("BTaQ"),u=a.n(o),s=a("gyMJ"),c=a("h0OX"),i=function(e,t){var a=arguments.length>2&&void 0!==arguments[2]?arguments[2]:"未命名文件";return s.a.get(e,{params:t,responseType:"blob"}).then(function(e){var t=function(e){var t=document.createElement("a");document.body.appendChild(t),t.href=URL.createObjectURL(e),t.download=a,t.click(),URL.revokeObjectURL(t.href),t.remove()},r=e.data;if(r.size<1024){var n=new FileReader;n.readAsText(r,"utf-8"),n.onload=function(e){var a=e.target;try{var n=JSON.parse(a.result).msg;u.a.Message.error("导出失败！"+n)}catch(e){t(r)}}}else t(r)})};t.a={queryFormMentBoxList:function(e){return s.a.get(c.a.MENU_SELECT_MENTBOX,{params:e})},queryFormBrandList:function(e){return s.a.get(c.a.FORM_BRAND_SELECT,{params:e})},queryFormBusinessList:function(e){return s.a.get(c.a.FORM_BUSINESS_SELECT,{params:e})},queryFromBusinessAppList:function(e){return s.a.get(c.a.FORM_BUSINESSAPP_SELECT,{params:e})},queryFromAppList:function(e){return s.a.get(c.a.FORM_APP_SELECT,{params:e})},queryFormSignTypeList:function(e){return s.a.get(c.a.FORM_SIGNTYPE_SELECT,{params:e})},queryFormPortalTypeList:function(e){return s.a.get(c.a.FORM_PORTALTYPE_SELECT,{params:e})},queryFormPaymentCodeList:function(e){return s.a.get(c.a.FORM_PAYMENTCODE_SELECT,{params:e})},queryFromPayTypeList:function(e){return s.a.get(c.a.FORM_PAYTYPE_SELECT,e)},queryFromNewPayTypeList:function(e){return s.a.get(c.a.FORM_NEW_PAYTYPE_SELECT,{params:e})},queryFromRoleList:function(e){return s.a.get(c.a.FORM_ROLE_SELECT,{params:e})},queryMenuTree:function(e){return s.a.get(c.a.MENU_TREE_SELECT,{params:e})},queryFromProductRuleList:function(e){return n.a.resolve({data:{code:200,data:[{code:"no",name:"无限制"},{code:"blocklist",name:"黑名单"}]}})},queryFromUserRuleList:function(e){return n.a.resolve({data:{code:200,data:[{code:"no",name:"无限制"},{code:"allowlist",name:"白名单"},{code:"blocklist",name:"黑名单"}]}})},queryFromDepartmentRuleList:function(e){return n.a.resolve({data:{code:200,data:[{code:"no",name:"无限制"},{code:"allowlist",name:"白名单"}]}})},queryFromOriginFromList:function(e){return n.a.resolve({data:{code:200,data:[{code:1,name:"正向支付"},{code:2,name:"反向退单"}]}})},queryEnvironmentList:function(e){return n.a.resolve({data:{code:200,data:[{code:"KS",name:"金山"},{code:"QC",name:"腾讯"},{code:"QCPIL",name:"腾讯灰灾"}]}})}}}});