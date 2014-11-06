Ext.onReady(function(){
	Ext.application({
		name:"app",//引用的名称
		scope :this,
        appFolder : "",//应用的目录
       autoCreateViewport: 'app.view.main.Main' , 
      controllers: ['app.controller.MainController'],
	/*  launch: function() {
		      
			  var controller=coreApp.getController(config[1]);
			  console.log(coreApp);
		  }*/
	})
});