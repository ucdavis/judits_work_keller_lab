## Objective
This repo contains info relating to the paper
-**artificial_intelligence_based_quantification_of_lymphocytes_in_feline_small_intestinal_biopsies**
Published 2024: https://doi.org/10.1177/0300985824128682
https://journals.sagepub.com/doi/full/10.1177/03009858241286828

WSIs, annotations and intermediate and output files are in bioimage archive (BIA):
<https://www.ebi.ac.uk/biostudies/bioimages/studies/S-BIAD1129?query=S-BIAD1129>

## samples
This paper use cases sampled with <fe_si_samples/labl_2020>
<https://github.com/ucdavis/fe_si_samples/tree/7cb003f5a76cce2259aa95f39e07b501edbfeb17/labl_2020>

## images
Images are tracked (along with all other images) in <fe_si_images>
<https://github.com/ucdavis/fe_si_images/tree/477214171431797a9a3795dc1a869a368b83e127>

## models
This paper uses versions of <fe_si_models/histology_component_suite/lymphocytes>
<https://github.com/ucdavis/fe_si_models/tree/ed8c6bd018b4bfc00267169de9ad62d1f83b290b/histology_component_suite/lymphocytes>
version: <fe_si_cells_pv3> (old name lc_1_5000_v11)
and <fe_si_models/histology_component_suite/compartments>:
<https://github.com/ucdavis/fe_si_models/tree/ed8c6bd018b4bfc00267169de9ad62d1f83b290b/histology_component_suite/compartments>
version: <fe_si_compartments_pv1> old name <Tissue 9>

## subfolders
- **AIFeBx_supplemental**: Shared as supplemental to the paper - the shared github repo is 
identical to this but no longer linked: can be found here: <https://github.com/ucdavis/judits_work_keller_lab/tree/main/fe_si_papers/ai_quantification_lymphocytes_fe_si_bx>
  - **scripts**: All scripts needed to reproduce the paper
  - **test_analysis**: All input, intermediate and output files needed to run the
   scripts (shared via BIA see above)
  - **trainingTuning_annotations**: From aiforia support (shared via BIA see above)
- **paper**: Contains published paper and submitted and presubmission versions
- **historic_script_versions**: Contains earlier versions / drafts of processing scripts
- **vault**: Contains important files for keeping (deidentified case-list)
- **file_list_bio_image_archive**: Contains metadata for bioimage archive (and 
the script to generate it)
   

### Related drive folder:
- **manual_grades**: Contains grading spreadsheets by external pathologists (test set)
and jmw (quality, fp assessment):
https://drive.google.com/drive/folders/1TrK0oJmQH1KVLhT6KlF1IteemKbedEZm?usp=sharing
- **stats_considerations**: 
https://drive.google.com/drive/folders/1TrK0oJmQH1KVLhT6KlF1IteemKbedEZm?usp=sharing 
  - **kappa_sample_size_considerations**: Contains supplementary material from 
  Allenspachs paper and derived calculations to estimate sample size for reproducibility
  - **stats_consultations**: Contains PPTX for stats consultations and calculations
  for kappa sample size (based on allenspachs supplemental table)
  
-**paper_drafts**: Early paper drafts
https://drive.google.com/drive/folders/1mbUyijZ6Nyt1k_sPQDD6rMnkPc46NJGy?usp=sharing


