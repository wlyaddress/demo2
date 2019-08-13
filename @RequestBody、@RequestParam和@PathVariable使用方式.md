@RequestBody
jQuery调用方式：
$.ajax({
   type:"post",
   url: prefix + "/ImagesUploaded",
   dataType: "json",
   headers: {'Content-Type':'application/json'},
   data:JSON.stringify(data_url),
   async:true,
   success:function(data){
   console.log(1);
  }
})
后台java controller形式
private String MultipleImagesUploaded(@RequestBody AnalyticalStatements analyticalStatements){
------------------------------------------------------------------------------------------------------------------
@RequestParam
jQuery调用方式：

deleteFile: function(filePath) {
        return ajax({
            method: 'POST',
            url: '/cm/soft/package/package/deleteFile',
            data: {
                fileDir: filePath
            }
        });
    },
    
后台java controller形式
    public BaseResultVO deleteFile(@RequestParam("fileDir") String fileDir) {}
    
----------------------------------------------------------------------------------------------------------------
@PathVariable
jQuery调用方式
savePackage: function(obj, packageId) {
        var url = "/cm/soft/package/package/" + packageId;
        return ajax({
            method: 'POST',
            url: url,
            data: obj,
        });
    }
    
后台java controller形式
public BaseResultVO delete(@PathVariable String packageid) {}
