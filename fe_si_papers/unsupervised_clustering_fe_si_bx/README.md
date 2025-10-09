# unsupervised_clustering_fe_si_bx

## Objective
This is to document the paper "Unsupervised Clustering of fe si bx"
Intended for submission to Veterinary Pathology November 2025 (and Ch 3 of JMWs 
dissertation)

## Folders
- **scripts**: Contains all scripts in pipeline
  - **agreement**: Parses pathologists grades and calculates mode and agreement
  - **ai_vs_path**: Calculate correlations between pathologists mode grade and 
  ai-derived features
- **input**: Contains input files for scripts that are not from other folders
in <judits_work_keller_lab> (mostly manually reviewed templates and what not)
- **output**: Contains outputs from each script (arranged by script name)
- **paper**: Contains paper drafts and versions
- **communication**: Contain mail threads of people to acknowledge
- **historic_versions**: Contains previous versions of this project (early draft pipeline)

## Study Overview

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

## Deep learning-based histology analysis

## Mucosal segmentation and QC

## Feature engineering

## Correlation between features and pathologist assessment

## Dimensionality reduction and unsupervised clustering analysis





