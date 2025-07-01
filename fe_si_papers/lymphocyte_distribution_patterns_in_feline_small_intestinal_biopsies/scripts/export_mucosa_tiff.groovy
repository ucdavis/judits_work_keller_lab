import qupath.lib.regions.RegionRequest
import qupath.lib.images.servers.ImageServer
import qupath.lib.images.writers.ImageWriterTools

def imageData = getCurrentImageData()
def server = imageData.getServer()
def imageName = server.getMetadata().getName().split("\\.")[0] 
def annotations = getAnnotationObjects()  
def homeDir = System.getProperty('user.home')
def outputDir = buildFilePath(homeDir,
    'Library', 'Cloudstorage', 'Box-Box',
    'judits_work_keller_lab', 'fe_si_papers', 'lymphocyte_distribution_patterns_in_feline_small_intestinal_biopsies', 
    'output', 'grading_sample', 'sampled_mucosa_tiff_ds2')
    

annotations.each { annotation ->
    def roi = annotation.getROI()
    def annotationName = annotation.getName() ?: "unnamed"
    def x0 = (int) roi.getBoundsX()
    def y0 = (int) roi.getBoundsY()
    def requestROI = RegionRequest.createInstance(server.getPath(), 2, roi)
    def outputPath = buildFilePath(outputDir, "${imageName}_${annotationName}_x${x0}_y${y0}_ds2.tiff")
    
    try {
        ImageWriterTools.writeImageRegion(server, requestROI, outputPath)
        println("Exported fragment to: ${outputPath}")
    } catch (Exception e) {
        println("Error exporting fragment ${annotationName}: ${e.getMessage()}")
    }
}

 
     