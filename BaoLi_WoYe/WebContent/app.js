Ext.onReady(function(){
	Ext.application({
		name:"app",//引用的名称
		scope :this,
        appFolder : "",//应用的目录
        launch:function(){//当前页面加载完成执行的函数
        },
        autoCreateViewport: 'app.view.main.Main' , 

	})
});