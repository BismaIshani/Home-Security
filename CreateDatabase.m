function T = CreateDatabase(TrainDatabasePath)

TrainFiles = dir(strcat(TrainDatabasePath,'*.png'));
save trn TrainFiles
Train_Number = size(TrainFiles,1);

%%%%%%%%%%%%%%%%%%%%%%%% Construction of 2D matrix from 1D image vectors
T = [];

for i = 1 : Train_Number
    
    % I have chosen the name of each image in databases as a corresponding
    % number. However, it is not mandatory!
    str = int2str(i);
    str = strcat(TrainDatabasePath,str,'.png');
    
    
    img = imread(str);
    img = rgb2gray(img);
    img=imresize(img,[128 128]);
    [irow icol] = size(img);
   
    temp = reshape(img',irow*icol,1);   % Reshaping 2D images into 1D image vectors
    T = [T temp]; % 'T' grows after each turn                    
    save tmp temp
end