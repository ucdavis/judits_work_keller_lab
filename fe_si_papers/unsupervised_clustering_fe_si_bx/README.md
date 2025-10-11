# unsupervised_clustering_fe_si_bx

## Objective
This is to document the paper "Unsupervised Clustering of fe si bx"
Intended for submission to Veterinary Pathology November 2025 (and Ch 3 of JMWs 
dissertation)

## Folders
- **scripts**: Contains all scripts in pipeline
  - **grading_sample**: Details sampling of "pathologist_grading_set"
  - **export_mucosa_tiff**: Exports sampled segments for "pathologist-grading-set"
  as downsampled tiff for grading
  - **agreement.Rmd**: Parses pathologists grades and calculates mode and agreement
  - **ai_vs_path.Rmd**: Calculate correlations between pathologists mode grade and 
  ai-derived features
  - **performance_mucosa**: Compared automatic mucosa qc to majority grade of pathologist
  - **flow_of_cases**: Details inclusion/exclusion (basis for fig 2)
  - **lymphocyte_distribution_features**: Computes features by mucosal segment
  - **parse_ai_features**: Parses and scales features
  - **explore unscaled**: Explores feature correlation and filters improbable 
  values -REDO for new all
	
	
  
  - **coauthor_order.Rmd** randomization of authors with equal contribution
  - **fig_1_schematic.Rmd** For example plots fig 1 (mock data)
- **input**: Contains input files for scripts that are not from other folders
in <judits_work_keller_lab> (mostly manually reviewed templates and what not)
- **output**: Contains outputs from each script (arranged by script name)
- **paper**: Contains paper drafts and versions
- **communication**: Contain mail threads of people to acknowledge
- **historic_versions**: Contains previous versions of this project (early draft pipeline)




prepare_for_clustering_draft - THIS IS PROBABLY THE REAL CLUSTERING SCRIPT

# Study Overview
1. Detect tissue (vs background) fe_si_models/fragment_quality_suite/tissue
2. Separate fragments (includes manual review step for applying exclusion criteria
on fragment-level) fe_si_models/fragment_quality_suite/fragments

The different steps and models applied are outlined in fe_si_models with
the steps to identify tissue, fragments and mucosal segments organized in different
subfolder under "fragment_quality_suite" and the dl models organized under 
"histology_component_suite". The DL models were chained within aforia and retreived 
with scripts in fe_si_platforms/aiforia

## Case Material
![Schematic](assets/case_material.png)

Outlined in detail (with inclusion/exclusion for each step in scripts/flow_of_cases

### Sampling
Contains wsis sampled from two sources:
- **Local**: VMTH cases.
  - Parsed from vmacs in repo <svm_archives/vmth>
  - Sampling documented in <fe_si_samples/spatial_2024>
- **External**: LABL cases.
 - Sampling described in <fe_si_samples/labl_2020> and <fe_si_samples/labl_2020_demo>
 
### Scanning
All sample information and scanning site etc is compiled in <fe_si_images/output/index/>
(Includes all WSIs considered)

## Data partitioning
- Model development set (training/tuning slides from fe_si_papers/ai_quantification_lymphocytes_fe_si_bx)
- Pathologist-grading set (detailed in scripts/grading_sample)
- Feature tuning set: 

## Deep learning-based histology analysis

## Mucosal segmentation and QC

## Feature engineering

## Correlation between features and pathologist assessment

## Dimensionality reduction and unsupervised clustering analysis





