webpackJsonp([2],{"+6Bu":function(t,e,n){"use strict";e.__esModule=!0,e.default=function(t,e){var n={};for(var a in t)e.indexOf(a)>=0||Object.prototype.hasOwnProperty.call(t,a)&&(n[a]=t[a]);return n}},"037f":function(t,e,n){var a=n("1oyr"),i=n("p0bc"),r=n("wSKX"),o=i?function(t,e){return i(t,"toString",{configurable:!0,enumerable:!1,value:a(e),writable:!0})}:r;t.exports=o},"0DSl":function(t,e,n){var a=n("YkxI"),i=n("zBOP");t.exports=function(t){return a(function(e,n){var a=-1,r=n.length,o=r>1?n[r-1]:void 0,s=r>2?n[2]:void 0;for(o=t.length>3&&"function"==typeof o?(r--,o):void 0,s&&i(n[0],n[1],s)&&(o=r<3?void 0:o,r=1),e=Object(e);++a<r;){var c=n[a];c&&t(e,c,a,o)}return e})}},"1oyr":function(t,e){t.exports=function(t){return function(){return t}}},"8AZL":function(t,e){t.exports=function(t,e,n){switch(n.length){case 0:return t.call(e);case 1:return t.call(e,n[0]);case 2:return t.call(e,n[0],n[1]);case 3:return t.call(e,n[0],n[1],n[2])}return t.apply(e,n)}},"9UkZ":function(t,e,n){var a=n("aCM0"),i=n("vi0E"),r=n("UnEC"),o="[object Object]",s=Function.prototype,c=Object.prototype,u=s.toString,l=c.hasOwnProperty,d=u.call(Object);t.exports=function(t){if(!r(t)||a(t)!=o)return!1;var e=i(t);if(null===e)return!0;var n=l.call(e,"constructor")&&e.constructor;return"function"==typeof n&&n instanceof n&&u.call(n)==d}},Fp5l:function(t,e,n){var a=n("bGc4"),i=n("UnEC");t.exports=function(t){return i(t)&&a(t)}},HXNr:function(t,e){},HbnZ:function(t,e,n){var a=n("bJWQ"),i=n("O1jc"),r=n("rpnb"),o=n("jMi8"),s=n("yCNF"),c=n("t8rQ"),u=n("MMop");t.exports=function t(e,n,l,d,p){e!==n&&r(n,function(r,c){if(p||(p=new a),s(r))o(e,n,c,l,t,d,p);else{var m=d?d(u(e,c),r,c+"",e,n,p):void 0;void 0===m&&(m=r),i(e,c,m)}},c)}},MMop:function(t,e){t.exports=function(t,e){if(("constructor"!==e||"function"!=typeof t[e])&&"__proto__"!=e)return t[e]}},O1jc:function(t,e,n){var a=n("nw3t"),i=n("22B7");t.exports=function(t,e,n){(void 0===n||i(t[e],n))&&(void 0!==n||e in t)||a(t,e,n)}},Q2wK:function(t,e,n){var a=n("8AZL"),i=Math.max;t.exports=function(t,e,n){return e=i(void 0===e?t.length-1:e,0),function(){for(var r=arguments,o=-1,s=i(r.length-e,0),c=Array(s);++o<s;)c[o]=r[e+o];o=-1;for(var u=Array(e+1);++o<e;)u[o]=r[o];return u[e]=n(c),a(t,this,u)}}},TlPD:function(t,e,n){var a=n("tv3T"),i=n("t8rQ");t.exports=function(t){return a(t,i(t))}},WHce:function(t,e,n){var a=n("037f"),i=n("Zk5a")(a);t.exports=i},YkxI:function(t,e,n){var a=n("wSKX"),i=n("Q2wK"),r=n("WHce");t.exports=function(t,e){return r(i(t,e,a),t+"")}},Zk5a:function(t,e){var n=800,a=16,i=Date.now;t.exports=function(t){var e=0,r=0;return function(){var o=i(),s=a-(o-r);if(r=o,s>0){if(++e>=n)return arguments[0]}else e=0;return t.apply(void 0,arguments)}}},e5i8:function(t,e,n){var a=n("HbnZ"),i=n("yCNF");t.exports=function t(e,n,r,o,s,c){return i(e)&&i(n)&&(c.set(n,e),a(e,n,void 0,t,c),c.delete(n)),e}},gs2Y:function(t,e,n){var a=n("8AZL"),i=n("YkxI"),r=n("e5i8"),o=n("zMR/"),s=i(function(t){return t.push(void 0,r),a(o,void 0,t)});t.exports=s},iQ6W:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var a=n("mvHQ"),i=n.n(a),r=n("//Fk"),o=n.n(r),s=(n("Dd8w"),n("is1l")),c=n("gyMJ"),u=n("h0OX"),l=function(t){return c.a.post(u.a.QUERY_APPLICATION_LIST,t)},d=function(t){return c.a.post(u.a.DEL_USER_DATA,t,{confirm:{}})},p=function(t){return c.a.post(u.a.Checkallamount,t)},m=function(t){return c.a.post(u.a.GET_BILL_REFUND_LIST,t)},f={components:{pageTableCopy:n("ZTZM").a},name:"applicationList",mixins:[s.a],data:function(){return{dateNum:null,Checkamount:null,tableData:{loading:!1,table:{border:!0,height:0,columns:[{type:"index",title:"序号",align:"center",minWidth:5},{title:"网支号",key:"paymentNum",align:"center",minWidth:60},{title:"交易号",key:"transactionNum",align:"center",minWidth:60},{title:"品牌",key:"brand",align:"center",minWidth:15},{title:"业务",key:"business",align:"center",minWidth:15},{title:"支付渠道",key:"channel",align:"center",minWidth:15},{title:"异常",key:"nonRefundReason",align:"center",minWidth:200},{title:"创建时间",key:"createDatenew",align:"center",minWidth:75},{title:"更新时间",key:"updateDatenew",align:"center",minWidth:75},{title:"退款发起人",key:"refundStaff",align:"center",minWidth:60},{title:"退款理由",key:"refundReason",align:"center",minWidth:60}],data:[]},page:{hide:!1}},formData:{legalCode:null,companyName:null,isFranchisees:null,applicationStatus:null,brandStatus:null,businessStatus:null,channelStatus:null,nonRefundReasonStatus:null},brandList:[{value:null,label:"全部"}],businessList:[{value:null,label:"全部"}],channelList:[{value:null,label:"全部"}]}},computed:{roleMap:function(){return(this.srcRoleList||[]).reduce(function(t,e){return t[e.code]=e.name,t},{})}},created:function(){null===localStorage.getItem("brand")&&null===localStorage.getItem("business")&&null===localStorage.getItem("channel")&&null===localStorage.getItem("nonRefundReasonStatus")?(localStorage.setItem("brand",this.$route.params.data),localStorage.setItem("business",this.$route.params.data1),localStorage.setItem("channel",this.$route.params.data2),localStorage.setItem("nonRefundReason",this.$route.params.data3),localStorage.setItem("dateNum",this.$route.params.data4),this.formData.brandStatus=localStorage.getItem("brand"),this.formData.businessStatus=localStorage.getItem("business"),this.formData.channelStatus=localStorage.getItem("channel"),this.formData.nonRefundReasonStatus=localStorage.getItem("nonRefundReason"),this.dateNum=localStorage.getItem("dateNum")):(this.formData.brandStatus=localStorage.getItem("brand"),this.formData.businessStatus=localStorage.getItem("business"),this.formData.channelStatus=localStorage.getItem("channel"),this.formData.nonRefundReasonStatus=localStorage.getItem("nonRefundReason"),this.dateNum=localStorage.getItem("dateNum")),this.queryBillRefundDetailsList()},mounted:function(){},beforeDestroy:function(){},destroyed:function(){localStorage.clear()},methods:{queryBillRefundDetailsList:function(){var t=this;m({brand:this.formData.brandStatus,business:this.formData.businessStatus,channel:this.formData.channelStatus,nonRefundReason:this.formData.nonRefundReasonStatus,dateNum:this.dateNum}).then(function(e){var n=e.data;if(200!==n.code&&"200"!==n.code)return o.a.reject(new Error(n.msg));console.log(n.data.managerBillRefundDTODetailsList),t.tableData.table.data=n.data.managerBillRefundDTODetailsList}).catch(function(t){console.log(t)})},showEditPopup:function(t){var e=this,n=t.row,a=t.column,i=t.index;switch(a.key){case"reason":case"add_data":this.$refs.EditPopup.showPopup({row:n,column:a,index:i},{srcRoleList:this.srcRoleList,srcStateList:this.srcStateList,isEdit:"reason"===a.key,callback:function(){e.queryData()}})}},delData:function(t){var e=this,n=t.row;t.column,t.index;d({id:n.id}).then(function(t){var n=t.data;if(200!==n.code&&"200"!==n.code)return o.a.reject(new Error(n.msg));e.$Message.success("操作成功"),e.queryData()}).catch(function(t){console.log(t)})},resetForm:function(){this.formData={legalCode:"",enableFlag:-1},this.mixin_resetPage()},setTableHeight:function(t){this.tableData.table.height=t},queryData:function(){var t=this;this.tableData.loading=!0,l({pageNum:this.tableData.page.current,pageSize:this.tableData.page.pageSize,legalCode:this.formData.legalCode,companyName:this.formData.companyName,isFranchisees:this.formData.isFranchisees,applicationStatus:this.formData.applicationStatus}).then(function(e){var n=e.data;if(console.log("测试中！"),console.log(t.currentOptions),console.log(t.tableData.page.current),console.log(t.tableData.page.pageSize),200===n.code||"200"===n.code){t.tableData.page.total=n.data.totalNum,console.log("test");for(var a=0,i=n.data.records.length;a<i;a++)console.log(n.data.records[a]),null===n.data.records[a].applicationStatus&&(n.data.records[a].applicationStatus="待创建"),10===n.data.records[a].applicationStatus&&(n.data.records[a].applicationStatus="草稿保存"),11===n.data.records[a].applicationStatus&&(n.data.records[a].applicationStatus="银联受理中"),20===n.data.records[a].applicationStatus&&(n.data.records[a].applicationStatus="资料校验中"),21===n.data.records[a].applicationStatus&&(n.data.records[a].applicationStatus="待账户验证"),22===n.data.records[a].applicationStatus&&(n.data.records[a].applicationStatus="金额审核中"),23===n.data.records[a].applicationStatus&&(n.data.records[a].applicationStatus="进件处理中"),24===n.data.records[a].applicationStatus&&(n.data.records[a].applicationStatus="电子签约中"),25===n.data.records[a].applicationStatus&&(n.data.records[a].applicationStatus="审核通过"),26===n.data.records[a].applicationStatus&&(n.data.records[a].applicationStatus="审核驳回"),27===n.data.records[a].applicationStatus&&(n.data.records[a].applicationStatus="账户冻结");t.tableData.table.data=n.data.records,console.log(n.data.records)}else t.$Message.error("请求响应状态错误")}).catch(function(e){t.$Message.error("查询异常"),console.log(e)}).finally(function(){t.tableData.loading=!1})},Checkallamount:function(t,e){var n=this;console.log("法人id",t),console.log("校验金额",e),p({legalCode:t,payAmount:e}).then(function(t){var e=t.data;console.log(i()(e)),200!==e.code&&"200"!==e.code||n.$Message.success("请求返回成功"),n.$Message.info("金额校验中")}).catch(function(t){console.log(i()(t)),n.$Message.error("请求返回异常"+t)})}}},h={render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"page-root",attrs:{id:"user-management"}},[n("page-table-copy",{on:{"on-table-ref":t.mixin_getTableRef},model:{value:t.tableData,callback:function(e){t.tableData=e},expression:"tableData"}}),t._v(" "),n("EditPopup",{ref:"EditPopup"})],1)},staticRenderFns:[]};var g=n("VU/8")(f,h,!1,function(t){n("HXNr")},"data-v-9d53f810",null);e.default=g.exports},is1l:function(t,e,n){"use strict";var a=n("//Fk"),i=n.n(a),r=n("Gu7T"),o=n.n(r),s=n("Dd8w"),c=n.n(s),u=n("+6Bu"),l=n.n(u),d=n("O4Lo"),p=n.n(d),m=n("gs2Y"),f=n.n(m),h=n("t5DY");e.a={data:function(){return{mentBoxList:[{code:-1,name:"全部"}],srcMentBoxList:[],brandList:[{code:-1,name:"全部"}],srcBrandList:[],businessList:[{code:-1,name:"全部"}],srcBusinessList:[],payTypeList:[{code:-1,name:"全部"}],srcPayTypeList:[],payNewTypeList:[{code:-1,name:"全部"}],srcPayNewTypeList:[],userRuleList:[],srcUserRuleList:[],productRuleList:[],srcProductRuleList:[],departmentRuleList:[],srcDepartmentRuleList:[],signTypeList:[{code:-1,name:"全部"}],srcSignTypeList:[],portalTypeList:[{code:-1,name:"全部"}],srcPortalTypeList:[],paymentCodeList:[{code:-1,name:"全部"}],srcPaymentCodeList:[],businessAppList:[{code:-1,name:"全部"}],srcBusinessAppList:[],appList:[{code:-1,name:"全部"}],srcAppList:[],roleList:[{code:-1,name:"全部"}],srcRoleList:[],srcFromOriginFromList:[],fromOriginFromList:[],srcEnvironmentList:[],environmentList:[],storeAscription:[{code:-1,name:"全部"}],srcStoreAscriptionList:[],stateList:[{code:-1,name:"全部"}],srcStateList:[],srcMenuTree:[],currentOptions:{},tableData:{page:{hide:!0,current:1,pageSize:10,showElevator:!0,showSizer:!0,on:{}}}}},created:function(){f()(this.tableData.page.on,{"on-change":this.mixin_changeCurrentPageIndex,"on-page-size-change":this.mixin_changePageSize})},methods:{mixin_getUnrepeatedList:function(t){var e={};return(t||[]).filter(function(t){var n=!e[t.code];return e[t.code]=t.code,n})},mixin_findBusinessListByBrandCode:function(t){var e=arguments.length>1&&void 0!==arguments[1]?arguments[1]:this.businessList,n=e;return t&&-1!==t&&e&&(n=e.filter(function(e){var n=e.brandCode;return!n||n===t})),this.mixin_getUnrepeatedList(n)},mixin_getBusinessAppByOptions:function(t){var e=t.businessCode,n=t.brandCode,a=arguments.length>1&&void 0!==arguments[1]?arguments[1]:this.businessAppList,i=a;return-1===e&&(e=""),-1===n&&(n=""),a&&(i=a.filter(function(t){var a=t.businessCode,i=t.brandCode;return!(n&&n!==i||e&&e!==a)})),this.mixin_getUnrepeatedList(i)},mixin_findPayTypeListByPortalTypeAndPaymentCode:function(t){var e=t.portalType,n=t.paymentCode,a=t.payTypeList,i=void 0===a?this.payTypeList:a,r=i;return-1===e&&(e=""),-1===n&&(n=""),i&&(r=i.filter(function(t){var a=t.portalType,i=t.productCode;return!(a&&a!==e||i&&i!==n)})),this.mixin_getUnrepeatedList(r)},mixin_getTableRef:function(t){t?(this.mixin_pageTableRef=t,this.mixin_calculateTableHeight(),window.addEventListener("resize",this.mixin_calculateTableHeight)):window.removeEventListener("resize",this.mixin_calculateTableHeight)},mixin_resetPage:function(){this.tableData.page.current=1,this.tableData.page.pageSize=10},mixin_calculateTableHeight:function(){},mixin_queryData:p()(function(){this.queryData()},200),mixin_changeCurrentPageIndex:function(t){this.tableData.page.current=t,this.mixin_queryData()},mixin_changePageSize:function(t){this.tableData.page.pageSize=t,this.mixin_queryData()},mixin_queryFormBrandList:function(t){var e=this;return h.a.queryFormBrandList(t).then(function(t){var n=t.data;200!==n.code&&"200"!==n.code||(e.srcBrandList=n.data.map(function(t){var e=t.code,n=l()(t,["code"]);return c()({},n,{code:e,name:e})}),e.brandList=[{code:-1,name:"全部"}].concat(o()(e.srcBrandList)))})},mixin_queryMentBoxList:function(t){var e=this;return h.a.queryFormMentBoxList(t).then(function(t){var n=t.data;200===n.code&&(e.srcMentBoxList=n.data.map(function(t){var e=t.code,n=t.name,a=l()(t,["code","name"]);return c()({},a,{code:e,name:e+" （"+n+"）"})}),e.mentBoxList=[{code:-1,name:"未选择"}].concat(o()(e.srcMentBoxList)))})},mixin_queryFormBusinessList:function(t){var e=this;return h.a.queryFormBusinessList(t).then(function(t){var n=t.data;200===n.code&&(e.srcBusinessList=n.data.map(function(t){var e=t.code,n=l()(t,["code"]);return c()({},n,{code:e,name:e})}),e.businessList=[{code:-1,name:"全部"}].concat(o()(e.srcBusinessList)))})},mixin_queryEnvironmentList:function(t){var e=this;return h.a.queryEnvironmentList(t).then(function(t){var n=t.data;200===n.code&&(e.srcEnvironmentList=n.data,e.environmentList=[{code:-1,name:"全部"}].concat(o()(e.srcEnvironmentList)))})},mixin_queryFormSignTypeList:function(t){var e=this;return h.a.queryFormSignTypeList(t).then(function(t){var n=t.data;200===n.code&&(e.srcSignTypeList=n.data.map(function(t){return{code:t,name:t}}),e.signTypeList=[{code:-1,name:"全部"}].concat(o()(e.srcSignTypeList)))})},mixin_queryFormPortalTypeList:function(t){var e=this;return h.a.queryFormPortalTypeList(t).then(function(t){var n=t.data;200===n.code&&(e.srcPortalTypeList=n.data,e.portalTypeList=[{code:-1,name:"全部"}].concat(o()(e.srcPortalTypeList)))})},mixin_queryFormPaymentCodeList:function(t){var e=this;return h.a.queryFormPaymentCodeList(t).then(function(t){var n=t.data;200===n.code&&(e.srcPaymentCodeList=n.data,e.paymentCodeList=[{code:-1,name:"全部"}].concat(o()(e.srcPaymentCodeList)))})},mixin_queryFromPayTypeList:function(t){var e=this;return h.a.queryFromPayTypeList(t).then(function(t){var n=t.data;200===n.code&&(e.srcPayTypeList=n.data,e.payTypeList=[{code:-1,name:"全部"}].concat(o()(e.srcPayTypeList)))})},mixin_queryFromNewPayTypeList:function(t){var e=this;return h.a.queryFromNewPayTypeList(t).then(function(t){var n=t.data;200===n.code&&(e.srcPayTypeList=n.data,e.payTypeList=[{code:-1,name:"全部"}].concat(o()(e.srcPayTypeList)))})},mixin_queryFromProductRuleList:function(t){var e=this;return h.a.queryFromProductRuleList(t).then(function(t){var n=t.data;200===n.code&&(e.srcProductRuleList=n.data,e.productRuleList=[{code:-1,name:"全部"}].concat(o()(e.srcProductRuleList)))})},mixin_queryFromUserRuleList:function(t){var e=this;return h.a.queryFromUserRuleList(t).then(function(t){var n=t.data;200===n.code&&(e.srcUserRuleList=n.data,e.userRuleList=[{code:-1,name:"全部"}].concat(o()(e.srcUserRuleList)))})},mixin_queryFromDepartmentRuleList:function(t){var e=this;return h.a.queryFromDepartmentRuleList(t).then(function(t){var n=t.data;200===n.code&&(e.srcDepartmentRuleList=n.data,e.departmentRuleList=[{code:-1,name:"全部"}].concat(o()(e.srcDepartmentRuleList)))})},mixin_queryFormBusinessAppList:function(t){var e=this;return h.a.queryFromBusinessAppList(t).then(function(t){var n=t.data;200===n.code&&(e.srcBusinessAppList=n.data,e.businessAppList=[{code:-1,name:"全部"}].concat(o()(e.srcBusinessAppList)))})},mixin_queryFromOriginFromList:function(t){var e=this;return h.a.queryFromOriginFromList(t).then(function(t){var n=t.data;200===n.code&&(e.srcFromOriginFromList=n.data,e.fromOriginFromList=[{code:-1,name:"全部"}].concat(o()(e.srcFromOriginFromList)))})},mixin_queryFromAppList:function(t){var e=this;return h.a.queryFromAppList(t).then(function(t){var n=t.data;200===n.code&&(e.srcAppList=n.data.map(function(t){return{code:t,name:t}}),e.appList=[{code:-1,name:"全部"}].concat(o()(e.srcAppList)))})},mixin_queryFromRoleList:function(t){var e=this;return h.a.queryFromRoleList(t).then(function(t){var n=t.data;200===n.code&&(e.srcRoleList=n.data,e.roleList=[{code:-1,name:"全部"}].concat(o()(e.srcRoleList)))})},mixin_queryMenuTree:function(t){var e=this;return h.a.queryMenuTree(t).then(function(t){var n=t.data;200===n.code&&(e.srcMenuTree=e.$ArrayObjectEach(n.data,function(t,e,n,a){t.title=t.name,t.expand=!0}))})},mixin_queryFormAscriptionList:function(){return this.srcStoreAscriptionList=[{code:"false",name:"直营"},{code:"true",name:"加盟"}],this.storeAscriptionList=[{code:-1,name:"全部"}].concat(o()(this.srcStoreAscriptionList)),i.a.resolve()},mixin_queryFormStateList:function(){return this.srcStateList=[{name:"启用",code:"true"},{name:"禁用",code:"false"}],this.stateList=[{code:-1,name:"全部"}].concat(o()(this.srcStateList)),i.a.resolve()}}}},jMi8:function(t,e,n){var a=n("O1jc"),i=n("mKB/"),r=n("Ilb/"),o=n("hrPF"),s=n("WQFf"),c=n("1Yb9"),u=n("NGEn"),l=n("Fp5l"),d=n("ggOT"),p=n("gGqR"),m=n("yCNF"),f=n("9UkZ"),h=n("YsVG"),g=n("MMop"),L=n("TlPD");t.exports=function(t,e,n,y,v,b,S){var x=g(t,n),D=g(e,n),R=S.get(D);if(R)a(t,n,R);else{var _=b?b(x,D,n+"",t,e,S):void 0,T=void 0===_;if(T){var F=u(D),P=!F&&d(D),q=!F&&!P&&h(D);_=D,F||P||q?u(x)?_=x:l(x)?_=o(x):P?(T=!1,_=i(D,!0)):q?(T=!1,_=r(D,!0)):_=[]:f(D)||c(D)?(_=x,c(x)?_=L(x):m(x)&&!p(x)||(_=s(D))):T=!1}T&&(S.set(D,_),v(_,D,y,b,S),S.delete(D)),a(t,n,_)}}},rpnb:function(t,e,n){var a=n("tHks")();t.exports=a},tHks:function(t,e){t.exports=function(t){return function(e,n,a){for(var i=-1,r=Object(e),o=a(e),s=o.length;s--;){var c=o[t?s:++i];if(!1===n(r[c],c,r))break}return e}}},wSKX:function(t,e){t.exports=function(t){return t}},zBOP:function(t,e,n){var a=n("22B7"),i=n("bGc4"),r=n("ZGh9"),o=n("yCNF");t.exports=function(t,e,n){if(!o(n))return!1;var s=typeof e;return!!("number"==s?i(n)&&r(e,n.length):"string"==s&&e in n)&&a(n[e],t)}},"zMR/":function(t,e,n){var a=n("HbnZ"),i=n("0DSl")(function(t,e,n,i){a(t,e,n,i)});t.exports=i}});